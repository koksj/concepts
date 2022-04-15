/**
 * Authors:
 *     Stefan Kok 
 * 
 * Copyright (C) 2020 Sefan Kok. All Rights Reserved.
 * 
 * This file is part of Immutable Builder.
 * 
 * Immutable Builder is free software; you can redistribute it and/or modify it under the terms of the 
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

public class App {

    public static void main(String[] args) throws Exception {
       
        /**
         * 
         */
        Tercet<Student, String, String, String> tercet = (id, name, surname) -> new Student(id, name, surname);       
        System.out.println(tercet.get("7fb48204-031b-48b2-a5a3-9236b05b31a6", "Peter", "Pan"));

        /** 
         * 
         */        
        Student part = ImmutableBuilder.of(Student::new, "e8d43f07-0a64-414c-b70a-cd5213a7bc52", "Jack", "Ryder");        
        System.out.println(part);

    }
}
