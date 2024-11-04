package j$.nio.file.attribute;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class I {
    public static final I GROUP_EXECUTE;
    public static final I GROUP_READ;
    public static final I GROUP_WRITE;
    public static final I OTHERS_EXECUTE;
    public static final I OTHERS_READ;
    public static final I OTHERS_WRITE;
    public static final I OWNER_EXECUTE;
    public static final I OWNER_READ;
    public static final I OWNER_WRITE;
    private static final /* synthetic */ I[] a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Enum, j$.nio.file.attribute.I] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, j$.nio.file.attribute.I] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Enum, j$.nio.file.attribute.I] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, j$.nio.file.attribute.I] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Enum, j$.nio.file.attribute.I] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Enum, j$.nio.file.attribute.I] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, j$.nio.file.attribute.I] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, j$.nio.file.attribute.I] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Enum, j$.nio.file.attribute.I] */
    static {
        ?? r9 = new Enum("OWNER_READ", 0);
        OWNER_READ = r9;
        ?? r10 = new Enum("OWNER_WRITE", 1);
        OWNER_WRITE = r10;
        ?? r11 = new Enum("OWNER_EXECUTE", 2);
        OWNER_EXECUTE = r11;
        ?? r12 = new Enum("GROUP_READ", 3);
        GROUP_READ = r12;
        ?? r13 = new Enum("GROUP_WRITE", 4);
        GROUP_WRITE = r13;
        ?? r14 = new Enum("GROUP_EXECUTE", 5);
        GROUP_EXECUTE = r14;
        ?? r15 = new Enum("OTHERS_READ", 6);
        OTHERS_READ = r15;
        ?? r3 = new Enum("OTHERS_WRITE", 7);
        OTHERS_WRITE = r3;
        ?? r2 = new Enum("OTHERS_EXECUTE", 8);
        OTHERS_EXECUTE = r2;
        a = new I[]{r9, r10, r11, r12, r13, r14, r15, r3, r2};
    }

    public static I valueOf(String str) {
        return (I) Enum.valueOf(I.class, str);
    }

    public static I[] values() {
        return (I[]) a.clone();
    }
}
