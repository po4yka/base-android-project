package com.po4yka.baseproject.di

import com.po4yka.data.di.getDataModules
import com.po4yka.domain.di.getDomainModules
import org.koin.core.module.Module
import org.koin.dsl.module

val module = module {
}

fun getDI(): List<Module> {
    val domainModules = getDomainModules()
    val dataModules = getDataModules()
    return mutableListOf(module).also {
        it.addAll(domainModules)
        it.addAll(dataModules)
    }
}
