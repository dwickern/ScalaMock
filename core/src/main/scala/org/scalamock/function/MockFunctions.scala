package org.scalamock.function

import org.scalamock.context.MockContext
import org.scalamock.util.Defaultable

trait MockFunctions { this: MockContext =>
  import scala.language.implicitConversions

  protected case class FunctionName(name: Symbol)
  protected implicit def functionName(name: Symbol) = FunctionName(name)
  protected implicit def functionName(name: String) = FunctionName(Symbol(name))

  protected def mockFunction[R: Defaultable](name: FunctionName) = new MockFunction0[R](this, name.name)
  protected def mockFunction[T1, R: Defaultable](name: FunctionName) = new MockFunction1[T1, R](this, name.name)
  protected def mockFunction[T1, T2, R: Defaultable](name: FunctionName) = new MockFunction2[T1, T2, R](this, name.name)
  protected def mockFunction[T1, T2, T3, R: Defaultable](name: FunctionName) = new MockFunction3[T1, T2, T3, R](this, name.name)
  protected def mockFunction[T1, T2, T3, T4, R: Defaultable](name: FunctionName) = new MockFunction4[T1, T2, T3, T4, R](this, name.name)
  protected def mockFunction[T1, T2, T3, T4, T5, R: Defaultable](name: FunctionName) = new MockFunction5[T1, T2, T3, T4, T5, R](this, name.name)
  protected def mockFunction[T1, T2, T3, T4, T5, T6, R: Defaultable](name: FunctionName) = new MockFunction6[T1, T2, T3, T4, T5, T6, R](this, name.name)
  protected def mockFunction[T1, T2, T3, T4, T5, T6, T7, R: Defaultable](name: FunctionName) = new MockFunction7[T1, T2, T3, T4, T5, T6, T7, R](this, name.name)
  protected def mockFunction[T1, T2, T3, T4, T5, T6, T7, T8, R: Defaultable](name: FunctionName) = new MockFunction8[T1, T2, T3, T4, T5, T6, T7, T8, R](this, name.name)
  protected def mockFunction[T1, T2, T3, T4, T5, T6, T7, T8, T9, R: Defaultable](name: FunctionName) = new MockFunction9[T1, T2, T3, T4, T5, T6, T7, T8, T9, R](this, name.name)

  protected def mockFunction[R: Defaultable] = new MockFunction0[R](this, generateMockDefaultName("MockFunction0"))
  protected def mockFunction[T1, R: Defaultable] = new MockFunction1[T1, R](this, generateMockDefaultName("MockFunction1"))
  protected def mockFunction[T1, T2, R: Defaultable] = new MockFunction2[T1, T2, R](this, generateMockDefaultName("MockFunction2"))
  protected def mockFunction[T1, T2, T3, R: Defaultable] = new MockFunction3[T1, T2, T3, R](this, generateMockDefaultName("MockFunction3"))
  protected def mockFunction[T1, T2, T3, T4, R: Defaultable] = new MockFunction4[T1, T2, T3, T4, R](this, generateMockDefaultName("MockFunction4"))
  protected def mockFunction[T1, T2, T3, T4, T5, R: Defaultable] = new MockFunction5[T1, T2, T3, T4, T5, R](this, generateMockDefaultName("MockFunction5"))
  protected def mockFunction[T1, T2, T3, T4, T5, T6, R: Defaultable] = new MockFunction6[T1, T2, T3, T4, T5, T6, R](this, generateMockDefaultName("MockFunction6"))
  protected def mockFunction[T1, T2, T3, T4, T5, T6, T7, R: Defaultable] = new MockFunction7[T1, T2, T3, T4, T5, T6, T7, R](this, generateMockDefaultName("MockFunction7"))
  protected def mockFunction[T1, T2, T3, T4, T5, T6, T7, T8, R: Defaultable] = new MockFunction8[T1, T2, T3, T4, T5, T6, T7, T8, R](this, generateMockDefaultName("MockFunction8"))
  protected def mockFunction[T1, T2, T3, T4, T5, T6, T7, T8, T9, R: Defaultable] = new MockFunction9[T1, T2, T3, T4, T5, T6, T7, T8, T9, R](this, generateMockDefaultName("MockFunction9"))

  protected def stubFunction[R: Defaultable](name: FunctionName) = new StubFunction0[R](this, name.name)
  protected def stubFunction[T1, R: Defaultable](name: FunctionName) = new StubFunction1[T1, R](this, name.name)
  protected def stubFunction[T1, T2, R: Defaultable](name: FunctionName) = new StubFunction2[T1, T2, R](this, name.name)
  protected def stubFunction[T1, T2, T3, R: Defaultable](name: FunctionName) = new StubFunction3[T1, T2, T3, R](this, name.name)
  protected def stubFunction[T1, T2, T3, T4, R: Defaultable](name: FunctionName) = new StubFunction4[T1, T2, T3, T4, R](this, name.name)
  protected def stubFunction[T1, T2, T3, T4, T5, R: Defaultable](name: FunctionName) = new StubFunction5[T1, T2, T3, T4, T5, R](this, name.name)
  protected def stubFunction[T1, T2, T3, T4, T5, T6, R: Defaultable](name: FunctionName) = new StubFunction6[T1, T2, T3, T4, T5, T6, R](this, name.name)
  protected def stubFunction[T1, T2, T3, T4, T5, T6, T7, R: Defaultable](name: FunctionName) = new StubFunction7[T1, T2, T3, T4, T5, T6, T7, R](this, name.name)
  protected def stubFunction[T1, T2, T3, T4, T5, T6, T7, T8, R: Defaultable](name: FunctionName) = new StubFunction8[T1, T2, T3, T4, T5, T6, T7, T8, R](this, name.name)
  protected def stubFunction[T1, T2, T3, T4, T5, T6, T7, T8, T9, R: Defaultable](name: FunctionName) = new StubFunction9[T1, T2, T3, T4, T5, T6, T7, T8, T9, R](this, name.name)

  protected def stubFunction[R: Defaultable] = new StubFunction0[R](this, generateMockDefaultName("StubFunction0"))
  protected def stubFunction[T1, R: Defaultable] = new StubFunction1[T1, R](this, generateMockDefaultName("StubFunction1"))
  protected def stubFunction[T1, T2, R: Defaultable] = new StubFunction2[T1, T2, R](this, generateMockDefaultName("StubFunction2"))
  protected def stubFunction[T1, T2, T3, R: Defaultable] = new StubFunction3[T1, T2, T3, R](this, generateMockDefaultName("StubFunction3"))
  protected def stubFunction[T1, T2, T3, T4, R: Defaultable] = new StubFunction4[T1, T2, T3, T4, R](this, generateMockDefaultName("StubFunction4"))
  protected def stubFunction[T1, T2, T3, T4, T5, R: Defaultable] = new StubFunction5[T1, T2, T3, T4, T5, R](this, generateMockDefaultName("StubFunction5"))
  protected def stubFunction[T1, T2, T3, T4, T5, T6, R: Defaultable] = new StubFunction6[T1, T2, T3, T4, T5, T6, R](this, generateMockDefaultName("StubFunction6"))
  protected def stubFunction[T1, T2, T3, T4, T5, T6, T7, R: Defaultable] = new StubFunction7[T1, T2, T3, T4, T5, T6, T7, R](this, generateMockDefaultName("StubFunction7"))
  protected def stubFunction[T1, T2, T3, T4, T5, T6, T7, T8, R: Defaultable] = new StubFunction8[T1, T2, T3, T4, T5, T6, T7, T8, R](this, generateMockDefaultName("StubFunction8"))
  protected def stubFunction[T1, T2, T3, T4, T5, T6, T7, T8, T9, R: Defaultable] = new StubFunction9[T1, T2, T3, T4, T5, T6, T7, T8, T9, R](this, generateMockDefaultName("StubFunction9"))
}
