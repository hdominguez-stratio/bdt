/*
 * Copyright (C) 2014 Stratio (http://stratio.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.stratio.qa.utils.vaultansible.decoders;

import java.io.IOException;
import java.io.OutputStream;

public interface CypherInterface {

    void decrypt(OutputStream decodedStream, byte[] data, String password) throws IOException;

    byte[] decrypt(byte[] encryptedData, String password) throws IOException;
}
