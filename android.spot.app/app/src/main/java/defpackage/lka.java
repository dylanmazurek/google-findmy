package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum lka {
    VOID(Void.class),
    INT(Integer.class),
    LONG(Long.class),
    FLOAT(Float.class),
    DOUBLE(Double.class),
    BOOLEAN(Boolean.class),
    STRING(String.class),
    BYTE_STRING(lim.class),
    ENUM(Integer.class),
    MESSAGE(Object.class);

    public final Class k;

    static {
        lim limVar = lim.b;
    }

    lka(Class cls) {
        this.k = cls;
    }
}
