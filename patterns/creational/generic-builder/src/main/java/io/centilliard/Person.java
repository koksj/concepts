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

public class Person {

    private String id;
    private String name;
    private String surname;

    public Person() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", surname=" + surname + "]";
    }

}
