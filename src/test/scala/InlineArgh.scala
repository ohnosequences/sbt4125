package issues.sbt4125.test

import issues.sbt4125._

class InlineBreaksCompilation extends org.scalatest.FunSuite {

  test("it does") {

    assert { useInlinedStuff.z == 2  }
  }
}