/**
 * Authors:
 *     Stefan Kok 
 * 
 * Copyright (C) 2020 Sefan Kok. All Rights Reserved.
 * 
 * This file is part of Generic Builder Pattern.
 * 
 * Generic Builder Pattern is free software; you can redistribute it and/or modify it under the terms of the 
 * GNU General Public License as published by the Free Software Foundation; version 2.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even
 * the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 * 
 */

package io.centilliard;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public final class GenericBuilder<T> {

    private final Supplier<T> supplier;
 
    private List<Consumer<T>> instanceModifiers = new ArrayList<>();
    
    private GenericBuilder(Supplier<T> instantiator) {
        this.supplier = instantiator;
    }

    public static <T> GenericBuilder<T> of(Supplier<T> instantiator) {
        return new GenericBuilder<T>(instantiator);
    }

    public <U> GenericBuilder<T> with(BiConsumer<T, U> consumer, U value) {
        Consumer<T> c = instance -> consumer.accept(instance, value);
        instanceModifiers.add(c);
        return this;
    }

    public T build() {
        T value = supplier.get();
        instanceModifiers.forEach(modifier -> modifier.accept(value));
        instanceModifiers.clear();
        return value;
    }
}