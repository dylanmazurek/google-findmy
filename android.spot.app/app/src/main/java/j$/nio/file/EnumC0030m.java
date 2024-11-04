package j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.nio.file.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0030m implements p, CopyOption {
    public static final EnumC0030m NOFOLLOW_LINKS;
    private static final /* synthetic */ EnumC0030m[] a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, j$.nio.file.m] */
    static {
        ?? r1 = new Enum("NOFOLLOW_LINKS", 0);
        NOFOLLOW_LINKS = r1;
        a = new EnumC0030m[]{r1};
    }

    public static EnumC0030m valueOf(String str) {
        return (EnumC0030m) Enum.valueOf(EnumC0030m.class, str);
    }

    public static EnumC0030m[] values() {
        return (EnumC0030m[]) a.clone();
    }
}
