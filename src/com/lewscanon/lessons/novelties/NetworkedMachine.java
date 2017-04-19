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
package com.lewscanon.lessons.novelties;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * A networked {@code enum}.
 */
public enum NetworkedMachine
{
    BASIC_MACHINE(-1, null),
    BEVERAGE(-1, BASIC_MACHINE),
    COFFEE(-1, BASIC_MACHINE),
    COFFEE_GRINDER(5, COFFEE),
    COFFEE_MACHINE(6, COFFEE),
    GARDEN(-1, BASIC_MACHINE),
    LAWN_MOWER(28, GARDEN),
    ;

    static final Map<NetworkedMachine, Set<NetworkedMachine>> owners;
    static {
      Map<NetworkedMachine, Set<NetworkedMachine>> ownership = new HashMap<>();
      for (NetworkedMachine machine : values()) {
        ownership.put(machine, new HashSet<>());
      }
      for (NetworkedMachine machine : values()) {
        if (machine.owner != null) {
          ownership.get(machine.owner).add(machine);
        }
      }
      for (NetworkedMachine machine : values()) {
        Set<NetworkedMachine> owned = ownership.get(machine);
        ownership.put(machine, Collections.unmodifiableSet(owned));
      }
      owners = Collections.unmodifiableMap(ownership);
    }
    private final int catalogId;
    private final NetworkedMachine owner;

    NetworkedMachine(int catalogId, NetworkedMachine machine) {
      this.catalogId = catalogId;
      this.owner = machine;
    }

    public int getCatalogId() {
      return catalogId;
    }

    public NetworkedMachine getOwner() {
      return owner;
    }

    public Set<NetworkedMachine> getOwns() {
      return owners.get(this);
    }

    public boolean isOwned() {
      return owner != null;
    }
}
