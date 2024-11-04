package j$.nio.file;

import java.nio.file.LinkOption;

/* renamed from: j$.nio.file.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0019b implements CopyOption {
    public final /* synthetic */ java.nio.file.CopyOption a;

    private /* synthetic */ C0019b(java.nio.file.CopyOption copyOption) {
        this.a = copyOption;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [j$.nio.file.CopyOption, java.nio.file.StandardCopyOption] */
    /* JADX WARN: Type inference failed for: r1v3, types: [j$.nio.file.CopyOption, java.nio.file.StandardCopyOption] */
    /* JADX WARN: Type inference failed for: r1v4, types: [j$.nio.file.CopyOption, java.nio.file.StandardCopyOption] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.nio.file.LinkOption, j$.nio.file.CopyOption] */
    public static /* synthetic */ CopyOption a(java.nio.file.CopyOption copyOption) {
        ?? r1;
        ?? r12;
        ?? r13;
        ?? r14;
        if (copyOption == 0) {
            return null;
        }
        if (copyOption instanceof C0020c) {
            return ((C0020c) copyOption).a;
        }
        if (copyOption instanceof EnumC0030m) {
            r14 = LinkOption.NOFOLLOW_LINKS;
            return r14;
        }
        if (copyOption instanceof StandardCopyOption) {
            StandardCopyOption standardCopyOption = (StandardCopyOption) copyOption;
            if (standardCopyOption == StandardCopyOption.REPLACE_EXISTING) {
                r13 = java.nio.file.StandardCopyOption.REPLACE_EXISTING;
                return r13;
            }
            if (standardCopyOption == StandardCopyOption.COPY_ATTRIBUTES) {
                r12 = java.nio.file.StandardCopyOption.COPY_ATTRIBUTES;
                return r12;
            }
            r1 = java.nio.file.StandardCopyOption.ATOMIC_MOVE;
            return r1;
        }
        return new C0019b(copyOption);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.nio.file.CopyOption copyOption = this.a;
        if (obj instanceof C0019b) {
            obj = ((C0019b) obj).a;
        }
        return copyOption.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
