package j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class StandardCopyOption implements CopyOption {
    public static final StandardCopyOption ATOMIC_MOVE;
    public static final StandardCopyOption COPY_ATTRIBUTES;
    public static final StandardCopyOption REPLACE_EXISTING;
    private static final /* synthetic */ StandardCopyOption[] a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, j$.nio.file.StandardCopyOption] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, j$.nio.file.StandardCopyOption] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, j$.nio.file.StandardCopyOption] */
    static {
        ?? r3 = new Enum("REPLACE_EXISTING", 0);
        REPLACE_EXISTING = r3;
        ?? r4 = new Enum("COPY_ATTRIBUTES", 1);
        COPY_ATTRIBUTES = r4;
        ?? r5 = new Enum("ATOMIC_MOVE", 2);
        ATOMIC_MOVE = r5;
        a = new StandardCopyOption[]{r3, r4, r5};
    }

    public static StandardCopyOption valueOf(String str) {
        return (StandardCopyOption) Enum.valueOf(StandardCopyOption.class, str);
    }

    public static StandardCopyOption[] values() {
        return (StandardCopyOption[]) a.clone();
    }
}
