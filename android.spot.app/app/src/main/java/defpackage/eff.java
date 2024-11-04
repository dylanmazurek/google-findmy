package defpackage;

import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class eff implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ eff(int i) {
        this.a = i;
    }

    public final /* synthetic */ Function andThen(Function function) {
        switch (this.a) {
            case 0:
                return Function$CC.$default$andThen(this, function);
            case 1:
                return Function$CC.$default$andThen(this, function);
            case 2:
                return Function$CC.$default$andThen(this, function);
            case 3:
                return Function$CC.$default$andThen(this, function);
            case 4:
                return Function$CC.$default$andThen(this, function);
            case 5:
                return Function$CC.$default$andThen(this, function);
            case 6:
                return Function$CC.$default$andThen(this, function);
            case 7:
                return Function$CC.$default$andThen(this, function);
            case 8:
                return Function$CC.$default$andThen(this, function);
            case 9:
                return Function$CC.$default$andThen(this, function);
            case 10:
                return Function$CC.$default$andThen(this, function);
            case 11:
                return Function$CC.$default$andThen(this, function);
            case 12:
                return Function$CC.$default$andThen(this, function);
            case 13:
                return Function$CC.$default$andThen(this, function);
            case 14:
                return Function$CC.$default$andThen(this, function);
            case 15:
                return Function$CC.$default$andThen(this, function);
            case 16:
                return Function$CC.$default$andThen(this, function);
            case 17:
                return Function$CC.$default$andThen(this, function);
            case 18:
                return Function$CC.$default$andThen(this, function);
            case 19:
                return Function$CC.$default$andThen(this, function);
            default:
                return Function$CC.$default$andThen(this, function);
        }
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                jnk jnkVar = efh.am;
                return dyi.UNAVAILABLE;
            case 1:
                return new ArrayList();
            case 2:
                return eit.a();
            case 3:
                return (kyh) ((Map.Entry) obj).getKey();
            case 4:
                return ((eir) ((Map.Entry) obj).getValue()).a();
            case 5:
                return new eir((eit) ((Map.Entry) obj).getValue());
            case 6:
                kyh b = kyh.b(((kzb) obj).h);
                if (b == null) {
                    return kyh.UNRECOGNIZED;
                }
                return b;
            case 7:
                return (kyh) ((Map.Entry) obj).getKey();
            case 8:
                return ((eit) obj).d;
            case 9:
                jiy jiyVar = ekh.am;
                return eif.c;
            case 10:
                return (kzb) ((jer) obj).c();
            case 11:
                return ((eit) obj).d;
            case 12:
                return (kzb) ((jer) obj).c();
            case 13:
                return new ArrayList();
            case 14:
                return new cfn(new eqg(jdl.a));
            case 15:
                return new cfn(new eqg(jdl.a));
            case 16:
                return new cfn(jdl.a);
            case 17:
                return new cfn(jdl.a);
            case 18:
                int i = euq.a;
                return ((dhx) obj).a;
            case 19:
                int i2 = euq.a;
                return ((dhx) obj).a;
            default:
                return ((dya) obj).a.a();
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
            case 0:
                return Function$CC.$default$compose(this, function);
            case 1:
                return Function$CC.$default$compose(this, function);
            case 2:
                return Function$CC.$default$compose(this, function);
            case 3:
                return Function$CC.$default$compose(this, function);
            case 4:
                return Function$CC.$default$compose(this, function);
            case 5:
                return Function$CC.$default$compose(this, function);
            case 6:
                return Function$CC.$default$compose(this, function);
            case 7:
                return Function$CC.$default$compose(this, function);
            case 8:
                return Function$CC.$default$compose(this, function);
            case 9:
                return Function$CC.$default$compose(this, function);
            case 10:
                return Function$CC.$default$compose(this, function);
            case 11:
                return Function$CC.$default$compose(this, function);
            case 12:
                return Function$CC.$default$compose(this, function);
            case 13:
                return Function$CC.$default$compose(this, function);
            case 14:
                return Function$CC.$default$compose(this, function);
            case 15:
                return Function$CC.$default$compose(this, function);
            case 16:
                return Function$CC.$default$compose(this, function);
            case 17:
                return Function$CC.$default$compose(this, function);
            case 18:
                return Function$CC.$default$compose(this, function);
            case 19:
                return Function$CC.$default$compose(this, function);
            default:
                return Function$CC.$default$compose(this, function);
        }
    }
}
