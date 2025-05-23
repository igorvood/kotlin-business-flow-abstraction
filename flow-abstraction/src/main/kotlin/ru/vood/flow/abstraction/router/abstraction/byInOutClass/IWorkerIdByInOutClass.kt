package ru.vood.flow.abstraction.router.abstraction.byInOutClass

import ru.vood.flow.abstraction.router.abstraction.IWorkerId
import kotlin.reflect.KClass

/**
 * Интерфейс идентификатора рабочего объекта, специально разработанный для хранилища, где тип данных входа и выхода фиксируется заранее.
 * Расширяет стандартный интерфейс [IWorkerId], предоставляя дополнительную информацию о типах входных и выходных данных.
 *
 * @param T Тип входных данных, используемых рабочим объектом.
 * @param R Тип выходных данных, возвращаемых рабочим объектом.
 */
interface IWorkerIdByInOutClass<out T : Any, out R : Any> : IWorkerId {
    /**
     * Хранит информацию о классе входных данных, обрабатываемых рабочим объектом.
     * Полезно для дополнительной проверки типов данных при обработке.
     */
    val tkClass: KClass<out T>

    /**
     * Хранит информацию о классе выходных данных, возвращаемых рабочим объектом.
     * Помогает гарантировать правильность преобразования и представления данных.
     */
    val rkClass: KClass<out R>
}