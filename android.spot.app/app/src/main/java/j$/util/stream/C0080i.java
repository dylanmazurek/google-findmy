package j$.util.stream;

import j$.util.function.Function$CC;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0080i implements Supplier, Function {
    public final /* synthetic */ Collector a;

    public /* synthetic */ C0080i(Collector collector) {
        this.a = collector;
    }

    public /* synthetic */ Function andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        C0086l c0086l = (C0086l) obj;
        Set set = Collectors.a;
        C0082j c0082j = (C0082j) this.a;
        return new C0086l(c0082j.d().apply(c0086l.a), c0082j.d().apply(c0086l.b));
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        Set set = Collectors.a;
        C0082j c0082j = (C0082j) this.a;
        return new C0086l(c0082j.c().get(), c0082j.c().get());
    }
}
