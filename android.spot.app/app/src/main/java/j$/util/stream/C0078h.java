package j$.util.stream;

import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.LongFunction;

/* renamed from: j$.util.stream.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0078h implements BinaryOperator, LongFunction, Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0078h(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.a) {
            case 2:
                ((F0) this.b).accept((F0) obj);
                return;
            default:
                ((ArrayList) this.b).add(obj);
                return;
        }
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
            case 0:
                return BiFunction$CC.$default$andThen(this, function);
            default:
                return BiFunction$CC.$default$andThen(this, function);
        }
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        Object obj3 = this.b;
        switch (this.a) {
            case 0:
                C0086l c0086l = (C0086l) obj;
                C0086l c0086l2 = (C0086l) obj2;
                Set set = Collectors.a;
                BinaryOperator binaryOperator = (BinaryOperator) obj3;
                return new C0086l(binaryOperator.apply(c0086l.a, c0086l2.a), binaryOperator.apply(c0086l.b, c0086l2.b));
            default:
                ((C0074f) obj3).accept((C0074f) obj, obj2);
                return obj;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 2:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [j$.util.stream.h0, java.lang.Object] */
    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        C0074f c0074f = (C0074f) this.b;
        if (j >= 0 && j < 2147483639) {
            return new J(j, c0074f);
        }
        ?? obj = new Object();
        obj.d = new Object[16];
        return obj;
    }
}
