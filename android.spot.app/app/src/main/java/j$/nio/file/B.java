package j$.nio.file;

import java.nio.file.PathMatcher;

/* loaded from: classes2.dex */
public final /* synthetic */ class B implements PathMatcher {
    public final /* synthetic */ C a;

    private /* synthetic */ B(C c) {
        this.a = c;
    }

    public static /* synthetic */ PathMatcher a(C c) {
        if (c == null) {
            return null;
        }
        return c instanceof A ? ((A) c).a : new B(c);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        C c = this.a;
        if (obj instanceof B) {
            obj = ((B) obj).a;
        }
        return c.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.PathMatcher
    public final /* synthetic */ boolean matches(java.nio.file.Path path) {
        return this.a.a(t.k(path));
    }
}
