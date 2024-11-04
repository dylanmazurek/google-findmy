package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class nqg implements nrc, nra {
    public final nrc[] a;
    public final nra[] b;
    private final int c;
    private final int d;

    public nqg(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            Object obj = list.get(i);
            if (obj instanceof nqg) {
                f(arrayList, ((nqg) obj).a);
            } else {
                arrayList.add(obj);
            }
            Object obj2 = list.get(i + 1);
            if (obj2 instanceof nqg) {
                f(arrayList2, ((nqg) obj2).b);
            } else {
                arrayList2.add(obj2);
            }
        }
        if (!arrayList.contains(null) && !arrayList.isEmpty()) {
            int size2 = arrayList.size();
            this.a = new nrc[size2];
            int i2 = 0;
            for (int i3 = 0; i3 < size2; i3++) {
                nrc nrcVar = (nrc) arrayList.get(i3);
                i2 += nrcVar.b();
                this.a[i3] = nrcVar;
            }
            this.c = i2;
        } else {
            this.a = null;
            this.c = 0;
        }
        if (!arrayList2.contains(null) && !arrayList2.isEmpty()) {
            int size3 = arrayList2.size();
            this.b = new nra[size3];
            int i4 = 0;
            for (int i5 = 0; i5 < size3; i5++) {
                nra nraVar = (nra) arrayList2.get(i5);
                i4 += nraVar.a();
                this.b[i5] = nraVar;
            }
            this.d = i4;
            return;
        }
        this.b = null;
        this.d = 0;
    }

    private static final void f(List list, Object[] objArr) {
        if (objArr != null) {
            for (Object obj : objArr) {
                list.add(obj);
            }
        }
    }

    @Override // defpackage.nra
    public final int a() {
        return this.d;
    }

    @Override // defpackage.nrc
    public final int b() {
        return this.c;
    }

    @Override // defpackage.nra
    public final int c(nqw nqwVar, CharSequence charSequence, int i) {
        nra[] nraVarArr = this.b;
        if (nraVarArr != null) {
            for (int i2 = 0; i2 < nraVarArr.length && i >= 0; i2++) {
                i = nraVarArr[i2].c(nqwVar, charSequence, i);
            }
            return i;
        }
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.nrc
    public final void d(Appendable appendable, noh nohVar, Locale locale) {
        nrc[] nrcVarArr = this.a;
        if (nrcVarArr != null) {
            if (locale == null) {
                locale = Locale.getDefault();
            }
            for (nrc nrcVar : nrcVarArr) {
                nrcVar.d(appendable, nohVar, locale);
            }
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.nrc
    public final void e(Appendable appendable, long j, nno nnoVar, int i, nnw nnwVar, Locale locale) {
        Locale locale2;
        nrc[] nrcVarArr = this.a;
        if (nrcVarArr != null) {
            if (locale == null) {
                locale2 = Locale.getDefault();
            } else {
                locale2 = locale;
            }
            for (nrc nrcVar : nrcVarArr) {
                nrcVar.e(appendable, j, nnoVar, i, nnwVar, locale2);
            }
            return;
        }
        throw new UnsupportedOperationException();
    }
}
