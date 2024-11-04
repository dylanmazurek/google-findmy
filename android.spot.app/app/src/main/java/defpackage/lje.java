package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum lje {
    DOUBLE(0, 1, lka.DOUBLE),
    FLOAT(1, 1, lka.FLOAT),
    INT64(2, 1, lka.LONG),
    UINT64(3, 1, lka.LONG),
    INT32(4, 1, lka.INT),
    FIXED64(5, 1, lka.LONG),
    FIXED32(6, 1, lka.INT),
    BOOL(7, 1, lka.BOOLEAN),
    STRING(8, 1, lka.STRING),
    MESSAGE(9, 1, lka.MESSAGE),
    BYTES(10, 1, lka.BYTE_STRING),
    UINT32(11, 1, lka.INT),
    ENUM(12, 1, lka.ENUM),
    SFIXED32(13, 1, lka.INT),
    SFIXED64(14, 1, lka.LONG),
    SINT32(15, 1, lka.INT),
    SINT64(16, 1, lka.LONG),
    GROUP(17, 1, lka.MESSAGE),
    DOUBLE_LIST(18, 2, lka.DOUBLE),
    FLOAT_LIST(19, 2, lka.FLOAT),
    INT64_LIST(20, 2, lka.LONG),
    UINT64_LIST(21, 2, lka.LONG),
    INT32_LIST(22, 2, lka.INT),
    FIXED64_LIST(23, 2, lka.LONG),
    FIXED32_LIST(24, 2, lka.INT),
    BOOL_LIST(25, 2, lka.BOOLEAN),
    STRING_LIST(26, 2, lka.STRING),
    MESSAGE_LIST(27, 2, lka.MESSAGE),
    BYTES_LIST(28, 2, lka.BYTE_STRING),
    UINT32_LIST(29, 2, lka.INT),
    ENUM_LIST(30, 2, lka.ENUM),
    SFIXED32_LIST(31, 2, lka.INT),
    SFIXED64_LIST(32, 2, lka.LONG),
    SINT32_LIST(33, 2, lka.INT),
    SINT64_LIST(34, 2, lka.LONG),
    DOUBLE_LIST_PACKED(35, 3, lka.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, lka.FLOAT),
    INT64_LIST_PACKED(37, 3, lka.LONG),
    UINT64_LIST_PACKED(38, 3, lka.LONG),
    INT32_LIST_PACKED(39, 3, lka.INT),
    FIXED64_LIST_PACKED(40, 3, lka.LONG),
    FIXED32_LIST_PACKED(41, 3, lka.INT),
    BOOL_LIST_PACKED(42, 3, lka.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, lka.INT),
    ENUM_LIST_PACKED(44, 3, lka.ENUM),
    SFIXED32_LIST_PACKED(45, 3, lka.INT),
    SFIXED64_LIST_PACKED(46, 3, lka.LONG),
    SINT32_LIST_PACKED(47, 3, lka.INT),
    SINT64_LIST_PACKED(48, 3, lka.LONG),
    GROUP_LIST(49, 2, lka.MESSAGE),
    MAP(50, 4, lka.VOID);

    private static final lje[] aa;
    public final int Z;

    static {
        lje[] values = values();
        aa = new lje[values.length];
        for (lje ljeVar : values) {
            aa[ljeVar.Z] = ljeVar;
        }
    }

    lje(int i, int i2, lka lkaVar) {
        this.Z = i;
        int i3 = i2 - 1;
        if (i3 == 1 || i3 == 3) {
            Class cls = lkaVar.k;
        }
        if (i2 == 1) {
            lka lkaVar2 = lka.VOID;
            lkaVar.ordinal();
        }
    }
}
