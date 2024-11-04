package j$.desugar.sun.nio.fs;

import j$.nio.file.C;
import j$.nio.file.Path;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements C, Predicate {
    public final /* synthetic */ Object a;

    public /* synthetic */ h(Object obj) {
        this.a = obj;
    }

    @Override // j$.nio.file.C
    public boolean a(Path path) {
        return ((Pattern) this.a).matcher(path.toString()).matches();
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ Predicate negate() {
        return Predicate$CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        return !((Predicate) this.a).test(obj);
    }
}
