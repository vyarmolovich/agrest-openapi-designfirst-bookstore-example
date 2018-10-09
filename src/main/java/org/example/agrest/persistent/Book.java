package org.example.agrest.persistent;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

public class Book extends CayenneDataObject {

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<String> AUTHOR = Property.create("author", String.class);
    public static final Property<String> TITLE = Property.create("title", String.class);
    public static final Property<Category> CATEGORY = Property.create("category", Category.class);
}
