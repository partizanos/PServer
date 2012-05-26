/* 
 * Copyright 2011 NCSR "Demokritos"
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");   
 * you may not use this file except in compliance with the License.   
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 *    
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
*/

package pserver.algorithms.metrics;

import java.sql.SQLException;
import java.util.HashMap;
import pserver.data.VectorResultSet;
import pserver.domain.PFeature;
import pserver.domain.PUser;

/**
 *
 * @author alexm
 */
public interface VectorMetric {
    float getDistance( VectorResultSet vectors ) throws SQLException;
    float getDistance( PUser user1, PUser user2 ) throws SQLException;
    float getDistance( HashMap<String, PFeature> ftrs1, HashMap<String, PFeature> ftrs2 ) throws SQLException;
}
