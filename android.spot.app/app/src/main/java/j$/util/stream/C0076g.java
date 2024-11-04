package j$.util.stream;

import j$.util.function.BiConsumer$CC;
import j$.util.function.Consumer$CC;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0076g implements BiConsumer, Supplier, Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C0076g(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        ((BiConsumer) this.b).accept(this.c, obj);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case 0:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            default:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
        }
    }

    @Override // java.util.function.Supplier
    public Object get() {
        return new C0111y((EnumC0112z) this.b, (Predicate) this.c);
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        Object obj3 = this.b;
        Object obj4 = this.c;
        switch (this.a) {
            case 0:
                Collectors.a((Function) obj3, (Function) obj4, (Map) obj, obj2);
                return;
            default:
                C0086l c0086l = (C0086l) obj;
                Set set = Collectors.a;
                ((BiConsumer) obj3).accept(((Predicate) obj4).test(obj2) ? c0086l.a : c0086l.b, obj2);
                return;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
