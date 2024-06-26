/*
 * Copyright © 2012, Adam Retter / EXQuery
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the <organization> nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.exquery.restxq.impl.annotation;

import org.exquery.restxq.RestXqErrorCodes.RestXqErrorCode;
import org.exquery.restxq.annotation.HttpMethodAnnotation;
import org.exquery.restxq.annotation.RestAnnotationException;
import org.exquery.xquery.Cardinality;
import org.exquery.xquery.Type;

/**
 * Base class for RESTXQ Method Annotation Implementations
 *
 * @author Adam Retter
 */
public abstract class AbstractHttpMethodAnnotation extends AbstractRestAnnotation implements HttpMethodAnnotation {
    
    /**
     * Checks that a Path Annotation is present
     * as you cannot have a Method Annotation without a Path Annotation
     * 
     * @throws RestAnnotationException if the initialisation of this annotation fails
     */
    @Override
    public void initialise() throws RestAnnotationException {
        super.initialise();
    }

    @Override
    protected Cardinality getRequiredFunctionParameterCardinality() {
        throw new UnsupportedOperationException("Not required.");
    }

    @Override
    protected RestXqErrorCode getInvalidFunctionParameterCardinalityErr() {
        throw new UnsupportedOperationException("Not required.");
    }

    @Override
    protected Type getRequiredFunctionParameterType() {
        throw new UnsupportedOperationException("Not required.");
    }

    @Override
    protected RestXqErrorCode getInvalidFunctionParameterTypeErr() {
        throw new UnsupportedOperationException("Not required.");
    }
}