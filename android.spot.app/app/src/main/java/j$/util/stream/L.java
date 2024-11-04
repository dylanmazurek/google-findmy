package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* loaded from: classes2.dex */
class L extends AbstractC0072e {
    protected final AbstractC0064a h;
    protected final LongFunction i;
    protected final BinaryOperator j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public L(AbstractC0064a abstractC0064a, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(abstractC0064a, spliterator);
        this.h = abstractC0064a;
        this.i = longFunction;
        this.j = binaryOperator;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0072e
    public final Object a() {
        C c = (C) this.i.apply(this.h.e(this.b));
        this.h.p(this.b, c);
        return c.g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0072e
    public final AbstractC0072e c(Spliterator spliterator) {
        return new L(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0072e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC0072e abstractC0072e = this.d;
        if (abstractC0072e != null) {
            d((H) this.j.apply((H) ((L) abstractC0072e).b(), (H) ((L) this.e).b()));
        }
        super.onCompletion(countedCompleter);
    }

    L(L l, Spliterator spliterator) {
        super(l, spliterator);
        this.h = l.h;
        this.i = l.i;
        this.j = l.j;
    }
}
