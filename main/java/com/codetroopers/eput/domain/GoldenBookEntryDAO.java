/*
 * Copyright 2016 Code-Troopers.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.codetroopers.eput.domain;

import com.codetroopers.eput.domain.entities.GoldenBookEntry;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;


@Stateless
public class GoldenBookEntryDAO {
    @Inject
    EntityManager em;

    public List<GoldenBookEntry> all() {
       
        return em.createQuery("SELECT u FROM GoldenBookEntry u", GoldenBookEntry.class).getResultList();
    }

    public GoldenBookEntry create() {
    		GoldenBookEntry entry=new GoldenBookEntry();
    		em.persist(entry);
    		
        return entry;
    }
    
    public void delete(GoldenBookEntry entry) {
    		em.remove(em.contains(entry) ? entry : em.merge(entry));
	}

    
    public GoldenBookEntry create(GoldenBookEntry entry) {
		em.persist(entry);
		return entry;
}
}
