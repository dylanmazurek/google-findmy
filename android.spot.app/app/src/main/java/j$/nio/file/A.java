package j$.nio.file;

import java.nio.file.PathMatcher;

/* loaded from: classes2.dex */
public final /* synthetic */ class A implements C {
    public final /* synthetic */ PathMatcher a;

    private /* synthetic */ A(PathMatcher pathMatcher) {
        this.a = pathMatcher;
    }

    public static /* synthetic */ C b(PathMatcher pathMatcher) {
        if (pathMatcher == null) {
            return null;
        }
        return pathMatcher instanceof B ? ((B) pathMatcher).a : new A(pathMatcher);
    }

    @Override // j$.nio.file.C
    public final /* synthetic */ boolean a(Path path) {
        boolean matches;
        matches = this.a.matches(u.k(path));
        return matches;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PathMatcher pathMatcher = this.a;
        if (obj instanceof A) {
            obj = ((A) obj).a;
        }
        return pathMatcher.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
