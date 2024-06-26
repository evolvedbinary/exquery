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
package org.exquery.restxq.annotation;

import javax.xml.namespace.QName;
import org.exquery.restxq.Namespace;

/**
 * Names for the RESTXQ Annotations
 *
 * @author Adam Retter
 */
public enum RestAnnotationName {
        
    GET("GET"),
    HEAD("HEAD"),
    DELETE("DELETE"),
    POST("POST"),
    PUT("PUT"),
    OPTIONS("OPTIONS"),
    PATCH("PATCH"),

    path,
    produces,
    consumes,

    formparam("form-param"),
    queryparam("query-param"),
    headerparam("header-param"),
    cookieparam("cookie-param");

    final QName name;
    RestAnnotationName() {
        this.name = new QName(Namespace.ANNOTATION_NS, name());
    }
    
    RestAnnotationName(final String name) {
        this.name = new QName(Namespace.ANNOTATION_NS, name);
    }

    public static RestAnnotationName valueOf(final QName name) {             
        for(final RestAnnotationName an : RestAnnotationName.values()) {
            if(an.name.equals(name)) {
                return an;
            }
        }

        throw new IllegalArgumentException("Unknown name: " + name.toString());
    }

    public QName getQName() {
        return name;
    }
}
