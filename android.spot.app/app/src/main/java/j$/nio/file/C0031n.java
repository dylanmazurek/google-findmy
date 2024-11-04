package j$.nio.file;

import java.nio.file.LinkOption;
import java.nio.file.OpenOption;

/* renamed from: j$.nio.file.n */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0031n implements p {
    public final /* synthetic */ OpenOption a;

    private /* synthetic */ C0031n(OpenOption openOption) {
        this.a = openOption;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [j$.nio.file.p, java.nio.file.StandardOpenOption] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.nio.file.LinkOption, j$.nio.file.p] */
    public static /* synthetic */ p a(OpenOption openOption) {
        ?? r1;
        if (openOption == 0) {
            return null;
        }
        if (openOption instanceof o) {
            return ((o) openOption).a;
        }
        if (openOption instanceof EnumC0030m) {
            r1 = LinkOption.NOFOLLOW_LINKS;
            return r1;
        }
        if (openOption instanceof D) {
            return AbstractC0029l.b((D) openOption);
        }
        return new C0031n(openOption);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        OpenOption openOption = this.a;
        if (obj instanceof C0031n) {
            obj = ((C0031n) obj).a;
        }
        return openOption.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
