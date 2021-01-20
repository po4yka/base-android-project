package com.po4yka.domain.di

import org.koin.core.module.Module
import org.koin.dsl.module

val module = module {

}

fun getDomainModules(): List<Module> {
    return listOf(module)
}
