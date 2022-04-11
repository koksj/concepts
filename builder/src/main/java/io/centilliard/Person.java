/**
 * Authors:
 *     Stefan Kok 
 * 
 * Copyright (C) 2020 Sefan Kok. All Rights Reserved.
 * 
 * This file is part of Lambda Pattern Builder.
 * 
 * Lambda Pattern Builder is free software; you can redistribute it and/or modify it under the terms of the 
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

import java.util.function.Consumer;

public final class Person {

    private final String id;
    private final String name;
    private final String surname;

    private Person(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.surname = builder.surname;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public static class Builder {

        private String id;
        private String name;
        private String surname;

        private Builder() {

        }

        private Person build() {
            return new Person(this);
        }

        public static Person  with(Consumer<Builder> consumer) {
            Builder builder  = new Builder();
            consumer.accept(builder);
            return builder.build();
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", surname=" + surname + "]";
    }

}
