/*
 * Copyright 2017, Lewis S. Bloch.
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
 */
package com.lewscanon.lessons.algorithms;

/**
 * Kayload with key and payload.
 * @param <K> key type.
 * @param <P> payload type.
 */
public interface Kayload<K, P>
{
    /**
     * Get the key.
     *
     * @return the key.
     */
    K getKey();

    /**
     * Get the payload.
     *
     * @return the payload.
     */
    P getPayload();

    /**
     * Set the payload.
     *
     * @param payload the payload.
     */
    void setPayload(P payload);

    /**
     * Type-specific {@code equals} based on the key.
     * Not an override, for use by implementors in their {@link Object#equals(java.lang.Object)}.
     *
     * @param other Kayload<K, P> to compare.
     * @return true iff the keys are equal.
     */
    default boolean equals(Kayload<K, P> other)
    {
        return other != null
                && (getKey() == null ? other.getKey() == null : getKey().equals(other.getKey()));
    }

    /**
     * Hash based on the key, for use by implementors in their {@link Object#hashCode()}.
     *
     * @return a hash based on the key, consistent with {@link Kayload#equals(Payload)}.
     */
    default int hash()
    {
        return getKey() == null ? 0 : getKey().hashCode();
    }

    /**
     * The {@link String} representation of this {@code Kayload}.
     *
     * @return String representation.
     */
    default String representation()
    {
        return "{" + getKey() + ": " + getPayload() + "}";
    }

}
