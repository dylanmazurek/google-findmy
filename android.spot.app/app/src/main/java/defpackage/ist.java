package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ist implements gt {
    public isr a;
    public boolean b = false;
    public int c;
    private gh d;

    @Override // defpackage.gt
    public final int a() {
        return this.c;
    }

    @Override // defpackage.gt
    public final Parcelable bL() {
        inx inxVar;
        iss issVar = new iss();
        isr isrVar = this.a;
        issVar.a = isrVar.f;
        SparseArray sparseArray = isrVar.o;
        irq irqVar = new irq();
        for (int i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            inv invVar = (inv) sparseArray.valueAt(i);
            if (invVar != null) {
                inxVar = invVar.b.a;
            } else {
                inxVar = null;
            }
            irqVar.put(keyAt, inxVar);
        }
        issVar.b = irqVar;
        return issVar;
    }

    @Override // defpackage.gt
    public final void c(Context context, gh ghVar) {
        this.d = ghVar;
        this.a.A = ghVar;
    }

    @Override // defpackage.gt
    public final void e(gs gsVar) {
        throw null;
    }

    @Override // defpackage.gt
    public final void f(boolean z) {
        cmk cmkVar;
        if (!this.b) {
            if (z) {
                this.a.d();
                return;
            }
            isr isrVar = this.a;
            gh ghVar = isrVar.A;
            if (ghVar != null && isrVar.e != null) {
                int size = ghVar.size();
                if (size != isrVar.e.length) {
                    isrVar.d();
                    return;
                }
                int i = isrVar.f;
                for (int i2 = 0; i2 < size; i2++) {
                    MenuItem item = isrVar.A.getItem(i2);
                    if (item.isChecked()) {
                        isrVar.f = item.getItemId();
                        isrVar.g = i2;
                    }
                }
                if (i != isrVar.f && (cmkVar = isrVar.b) != null) {
                    cmh.b(isrVar, cmkVar);
                }
                boolean f = isrVar.f(isrVar.c, isrVar.A.f().size());
                for (int i3 = 0; i3 < size; i3++) {
                    isrVar.z.b = true;
                    isrVar.e[i3].w(isrVar.c);
                    isrVar.e[i3].s(isrVar.d);
                    isrVar.e[i3].y(f);
                    isrVar.e[i3].f((gj) isrVar.A.getItem(i3));
                    isrVar.z.b = false;
                }
            }
        }
    }

    @Override // defpackage.gt
    public final boolean g() {
        return false;
    }

    @Override // defpackage.gt
    public final boolean h(ha haVar) {
        return false;
    }

    @Override // defpackage.gt
    public final boolean i(gj gjVar) {
        return false;
    }

    @Override // defpackage.gt
    public final boolean j(gj gjVar) {
        return false;
    }

    @Override // defpackage.gt
    public final void n(Parcelable parcelable) {
        inv invVar;
        if (parcelable instanceof iss) {
            isr isrVar = this.a;
            iss issVar = (iss) parcelable;
            int i = issVar.a;
            int size = isrVar.A.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                MenuItem item = isrVar.A.getItem(i2);
                if (i == item.getItemId()) {
                    isrVar.f = i;
                    isrVar.g = i2;
                    item.setChecked(true);
                    break;
                }
                i2++;
            }
            Context context = this.a.getContext();
            irq irqVar = issVar.b;
            SparseArray sparseArray = new SparseArray(irqVar.size());
            for (int i3 = 0; i3 < irqVar.size(); i3++) {
                int keyAt = irqVar.keyAt(i3);
                inx inxVar = (inx) irqVar.valueAt(i3);
                if (inxVar != null) {
                    invVar = new inv(context, inxVar);
                } else {
                    invVar = null;
                }
                sparseArray.put(keyAt, invVar);
            }
            isr isrVar2 = this.a;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                int keyAt2 = sparseArray.keyAt(i4);
                if (isrVar2.o.indexOfKey(keyAt2) < 0) {
                    isrVar2.o.append(keyAt2, (inv) sparseArray.get(keyAt2));
                }
            }
            isp[] ispVarArr = isrVar2.e;
            if (ispVarArr != null) {
                for (isp ispVar : ispVarArr) {
                    inv invVar2 = (inv) isrVar2.o.get(ispVar.getId());
                    if (invVar2 != null) {
                        ispVar.n(invVar2);
                    }
                }
            }
        }
    }

    @Override // defpackage.gt
    public final void d(gh ghVar, boolean z) {
    }
}
