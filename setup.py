import re
import os
from tempfile import mkstemp
from shutil import move, copymode
from os import fdopen, remove


def replace(file_path, pattern, subst):
    fh, abs_path = mkstemp()
    with fdopen(fh, 'w') as new_file:
        with open(file_path) as old_file:
            for line in old_file:
                new_file.write(line.replace(pattern, subst))
    copymode(file_path, abs_path)
    remove(file_path)
    move(abs_path, file_path)


def rename_folder(rootdir, regex_group_number, package_match_obj, package_change):
    for subdir, dirs, _ in os.walk(rootdir):
        for dir in dirs:
            curr_folder = os.path.join(subdir, dir)
            if dir == package_match_obj.group(regex_group_number):
                new_folder = os.path.join(
                    subdir, package_change.group(regex_group_number))
                os.rename(curr_folder, new_folder)


def main():
    rootdir = "./"
    copyright_dir = "./.spotless/copyright.kt"

    package_default = "domen.default.change"
    package_pattern = "^(\w+)\.(\w+)\.(\w+)$"
    package_change = None
    package_match_obj = re.search(package_pattern, package_default)

    app_name_default = "DefaultAppNameChange"
    app_name_change = None

    copyright_pattern = "NAME_CHANGE"
    copyright_change = None

    print("Enter project packages structue in format: com.example.test")
    while(package_change == None):
        package_change = input("Project packages structure: ")
        package_change = re.search(package_pattern, package_change)

    while(app_name_change == None or app_name_change == ""):
        app_name_change = input("Project name: ")

    while(copyright_change == None or copyright_change == ""):
        copyright_change = input("Copyright name: ")

    for subdir, _, files in os.walk(rootdir):
        for file in files:
            if file.endswith(".kt") or file.endswith(".kts") or file.endswith(".xml"):
                replace(os.path.join(subdir, file),
                        package_default, package_change.group(0))
                replace(os.path.join(subdir, file),
                        app_name_default, app_name_change)
    print("Package name and Project name was successfully changed")

    for i in range(1, 4):
        rename_folder(rootdir, i, package_match_obj, package_change)
    print("Folders names were successfully changed according to the project structure")

    replace(copyright_dir, copyright_pattern, copyright_change)
    print("Copyright name was successfully changed")


if __name__ == "__main__":
    main()
