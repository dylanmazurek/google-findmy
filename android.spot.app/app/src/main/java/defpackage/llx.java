package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum llx {
    DOUBLE(lly.DOUBLE, 1),
    FLOAT(lly.FLOAT, 5),
    INT64(lly.LONG, 0),
    UINT64(lly.LONG, 0),
    INT32(lly.INT, 0),
    FIXED64(lly.LONG, 1),
    FIXED32(lly.INT, 5),
    BOOL(lly.BOOLEAN, 0),
    STRING(lly.STRING, 2),
    GROUP(lly.MESSAGE, 3),
    MESSAGE(lly.MESSAGE, 2),
    BYTES(lly.BYTE_STRING, 2),
    UINT32(lly.INT, 0),
    ENUM(lly.ENUM, 0),
    SFIXED32(lly.INT, 5),
    SFIXED64(lly.LONG, 1),
    SINT32(lly.INT, 0),
    SINT64(lly.LONG, 0);

    public final lly s;
    public final int t;

    llx(lly llyVar, int i) {
        this.s = llyVar;
        this.t = i;
    }
}
