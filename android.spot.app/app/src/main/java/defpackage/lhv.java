package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class lhv implements lkp {
    public static void g(Iterable iterable, List list) {
        ljw.b(iterable);
        if (iterable instanceof lkf) {
            List a = ((lkf) iterable).a();
            lkf lkfVar = (lkf) list;
            int size = list.size();
            for (Object obj : a) {
                if (obj == null) {
                    String str = "Element at index " + (lkfVar.size() - size) + " is null.";
                    int size2 = lkfVar.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            break;
                        } else {
                            lkfVar.remove(size2);
                        }
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof lim) {
                    lkfVar.b();
                } else if (obj instanceof byte[]) {
                    lim.t((byte[]) obj);
                    lkfVar.b();
                } else {
                    lkfVar.add((String) obj);
                }
            }
            return;
        }
        if (!(iterable instanceof lky)) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    String str2 = "Element at index " + (list.size() - size3) + " is null.";
                    int size4 = list.size();
                    while (true) {
                        size4--;
                        if (size4 < size3) {
                            break;
                        } else {
                            list.remove(size4);
                        }
                    }
                    throw new NullPointerException(str2);
                }
                list.add(obj2);
            }
            return;
        }
        list.addAll((Collection) iterable);
    }

    @Override // 
    /* renamed from: a */
    public abstract lhv clone();

    protected abstract lhv b(lhw lhwVar);

    @Override // defpackage.lkp
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final lhv e(byte[] bArr) {
        return j(bArr, bArr.length);
    }

    @Override // defpackage.lkp
    public final /* bridge */ /* synthetic */ lkp d(lkq lkqVar) {
        if (s().getClass().isInstance(lkqVar)) {
            return b((lhw) lkqVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    @Override // defpackage.lkp
    public final /* bridge */ /* synthetic */ lkp f(byte[] bArr, lja ljaVar) {
        return k(bArr, bArr.length, ljaVar);
    }

    /* renamed from: h */
    public abstract void i(liq liqVar, lja ljaVar);

    @Override // defpackage.lkp
    public /* bridge */ /* synthetic */ void i(liq liqVar, lja ljaVar) {
        throw null;
    }

    public lhv j(byte[] bArr, int i) {
        throw null;
    }

    public lhv k(byte[] bArr, int i, lja ljaVar) {
        throw null;
    }

    @Override // defpackage.lkp
    public final /* bridge */ /* synthetic */ void l(lim limVar) {
        try {
            liq k = limVar.k();
            lja ljaVar = lja.a;
            lkz lkzVar = lkz.a;
            i(k, lja.a);
            k.z(0);
        } catch (ljy e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading " + getClass().getName() + " from a ByteString threw an IOException (should never happen).", e2);
        }
    }
}
