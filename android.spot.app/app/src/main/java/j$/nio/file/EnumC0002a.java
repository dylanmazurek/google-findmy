package j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.nio.file.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0002a {
    public static final EnumC0002a EXECUTE;
    public static final EnumC0002a READ;
    public static final EnumC0002a WRITE;
    private static final /* synthetic */ EnumC0002a[] a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [j$.nio.file.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [j$.nio.file.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [j$.nio.file.a, java.lang.Enum] */
    static {
        ?? r3 = new Enum("READ", 0);
        READ = r3;
        ?? r4 = new Enum("WRITE", 1);
        WRITE = r4;
        ?? r5 = new Enum("EXECUTE", 2);
        EXECUTE = r5;
        a = new EnumC0002a[]{r3, r4, r5};
    }

    public static EnumC0002a valueOf(String str) {
        return (EnumC0002a) Enum.valueOf(EnumC0002a.class, str);
    }

    public static EnumC0002a[] values() {
        return (EnumC0002a[]) a.clone();
    }
}
