package com.cron.utils.model.field.definition;

import com.cron.utils.model.field.CronFieldName;
import com.cron.utils.model.definition.CronDefinitionBuilder;

/*
 * Copyright 2014 jmrozanec
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Builder that allows to specify properties for a cron field supporting non-standard characters
 */
public class FieldSpecialCharsDefinitionBuilder extends FieldDefinitionBuilder {

    /**
     * Constructor
     * @param parserBuilder - ParserDefinitionBuilder
     * @param fieldName - CronFieldName
     */
    public FieldSpecialCharsDefinitionBuilder(CronDefinitionBuilder parserBuilder, CronFieldName fieldName){
        super(parserBuilder, fieldName);
    }

    /**
     * Registers the field supports the hash (#) special char
     * @return this FieldSpecialCharsDefinitionBuilder instance
     */
    public FieldSpecialCharsDefinitionBuilder supportsHash(){
        constraints.addHashSupport();
        return this;
    }

    /**
     * Registers the field supports the L (L) special char
     * @return this FieldSpecialCharsDefinitionBuilder instance
     */
    public FieldSpecialCharsDefinitionBuilder supportsL(){
        constraints.addLSupport();
        return this;
    }

    /**
     * Registers the field supports the W (W) special char
     * @return this FieldSpecialCharsDefinitionBuilder instance
     */
    public FieldSpecialCharsDefinitionBuilder supportsW(){
        constraints.addWSupport();
        return this;
    }

    /**
     * Defines mapping between integer values with equivalent meaning
     * @param source - higher value
     * @param dest - lower value with equivalent meaning to source
     * @return this FieldSpecialCharsDefinitionBuilder instance
     */
    public FieldSpecialCharsDefinitionBuilder withIntMapping(int source, int dest){
        constraints.withIntValueMapping(source, dest);
        return this;
    }
}