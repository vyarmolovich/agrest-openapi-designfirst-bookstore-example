package org.example.agrest.persistent;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import java.util.List;

public class Category extends CayenneDataObject {

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<String> DESCRIPTION = Property.create("description", String.class);
    public static final Property<String> NAME = Property.create("name", String.class);
    public static final Property<List<Book>> BOOKS = Property.create("books", List.class);
}
