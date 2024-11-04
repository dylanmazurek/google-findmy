package j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class D implements p {
    public static final D APPEND;
    public static final D CREATE;
    public static final D CREATE_NEW;
    public static final D DELETE_ON_CLOSE;
    public static final D DSYNC;
    public static final D READ;
    public static final D SPARSE;
    public static final D SYNC;
    public static final D TRUNCATE_EXISTING;
    public static final D WRITE;
    private static final /* synthetic */ D[] a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Enum, j$.nio.file.D] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, j$.nio.file.D] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Enum, j$.nio.file.D] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, j$.nio.file.D] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Enum, j$.nio.file.D] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Enum, j$.nio.file.D] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, j$.nio.file.D] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, j$.nio.file.D] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, j$.nio.file.D] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, j$.nio.file.D] */
    static {
        ?? r10 = new Enum("READ", 0);
        READ = r10;
        ?? r11 = new Enum("WRITE", 1);
        WRITE = r11;
        ?? r12 = new Enum("APPEND", 2);
        APPEND = r12;
        ?? r13 = new Enum("TRUNCATE_EXISTING", 3);
        TRUNCATE_EXISTING = r13;
        ?? r14 = new Enum("CREATE", 4);
        CREATE = r14;
        ?? r15 = new Enum("CREATE_NEW", 5);
        CREATE_NEW = r15;
        ?? r5 = new Enum("DELETE_ON_CLOSE", 6);
        DELETE_ON_CLOSE = r5;
        ?? r4 = new Enum("SPARSE", 7);
        SPARSE = r4;
        ?? r3 = new Enum("SYNC", 8);
        SYNC = r3;
        ?? r2 = new Enum("DSYNC", 9);
        DSYNC = r2;
        a = new D[]{r10, r11, r12, r13, r14, r15, r5, r4, r3, r2};
    }

    public static D valueOf(String str) {
        return (D) Enum.valueOf(D.class, str);
    }

    public static D[] values() {
        return (D[]) a.clone();
    }
}
