package j$.nio.file;

import java.nio.file.LinkOption;

/* renamed from: j$.nio.file.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0020c implements java.nio.file.CopyOption {
    public final /* synthetic */ CopyOption a;

    private /* synthetic */ C0020c(CopyOption copyOption) {
        this.a = copyOption;
    }

    public static /* synthetic */ java.nio.file.CopyOption a(CopyOption copyOption) {
        java.nio.file.StandardCopyOption standardCopyOption;
        java.nio.file.StandardCopyOption standardCopyOption2;
        java.nio.file.StandardCopyOption standardCopyOption3;
        LinkOption linkOption;
        if (copyOption == null) {
            return null;
        }
        if (copyOption instanceof C0019b) {
            return ((C0019b) copyOption).a;
        }
        if (copyOption instanceof EnumC0030m) {
            linkOption = LinkOption.NOFOLLOW_LINKS;
            return linkOption;
        }
        if (copyOption instanceof StandardCopyOption) {
            StandardCopyOption standardCopyOption4 = (StandardCopyOption) copyOption;
            if (standardCopyOption4 == StandardCopyOption.REPLACE_EXISTING) {
                standardCopyOption3 = java.nio.file.StandardCopyOption.REPLACE_EXISTING;
                return standardCopyOption3;
            }
            if (standardCopyOption4 == StandardCopyOption.COPY_ATTRIBUTES) {
                standardCopyOption2 = java.nio.file.StandardCopyOption.COPY_ATTRIBUTES;
                return standardCopyOption2;
            }
            standardCopyOption = java.nio.file.StandardCopyOption.ATOMIC_MOVE;
            return standardCopyOption;
        }
        return new C0020c(copyOption);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        CopyOption copyOption = this.a;
        if (obj instanceof C0020c) {
            obj = ((C0020c) obj).a;
        }
        return copyOption.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
