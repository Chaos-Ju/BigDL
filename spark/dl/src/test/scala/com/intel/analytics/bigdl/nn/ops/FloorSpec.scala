/*
 * Copyright 2016 The BigDL Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intel.analytics.bigdl.nn.ops

import com.intel.analytics.bigdl.tensor.Tensor
import com.intel.analytics.bigdl.utils.T
import org.scalatest.{FlatSpec, Matchers}

class FloorSpec extends FlatSpec with Matchers {
  "Floor Float operation" should "works correctly" in {
    val input =
        Tensor[Float](T(1.5f, 2.1f, 2.9f))

    val expectOutput = Tensor[Float](T(1f, 2f, 2f))

    val output = Floor[Double]().forward(input)
    output should be(expectOutput)
  }

  "Floor Double operation" should "works correctly" in {
    val input =
      Tensor[Double](T(1.5, 2.1, 2.9))

    val expectOutput = Tensor[Double](T(1, 2, 2))

    val output = Floor[Double]().forward(input)
    output should be(expectOutput)
  }
}
