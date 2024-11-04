package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaz implements adk {
    public final Object a;
    public List b;
    public List c;
    public final ala d;
    private final mnw f;
    private Throwable g;

    public aaz() {
        this(null);
    }

    @Override // defpackage.adk
    public final Object a(moh mohVar, mmx mmxVar) {
        mnw mnwVar;
        mse mseVar = new mse(mjo.w(mmxVar), 1);
        mseVar.z();
        aax aaxVar = new aax(mohVar, mseVar);
        synchronized (this.a) {
            Throwable th = this.g;
            if (th != null) {
                mseVar.p(mjo.n(th));
            } else {
                boolean isEmpty = this.b.isEmpty();
                this.b.add(aaxVar);
                if (isEmpty) {
                    this.d.set(1);
                }
                mseVar.d(new aay(this, aaxVar));
                if (isEmpty && (mnwVar = this.f) != null) {
                    try {
                        mnwVar.a();
                    } catch (Throwable th2) {
                        synchronized (this.a) {
                            if (this.g == null) {
                                this.g = th2;
                                List list = this.b;
                                int size = list.size();
                                for (int i = 0; i < size; i++) {
                                    ((aax) list.get(i)).b.p(mjo.n(th2));
                                }
                                this.b.clear();
                                this.d.set(0);
                            }
                        }
                    }
                }
            }
        }
        return mseVar.j();
    }

    @Override // defpackage.mnb
    public final Object fold(Object obj, mol molVar) {
        return mjo.x(this, obj, molVar);
    }

    @Override // defpackage.mmz, defpackage.mnb
    public final mmz get(mna mnaVar) {
        return mjo.y(this, mnaVar);
    }

    @Override // defpackage.mmz
    public final /* synthetic */ mna getKey() {
        return adk.e;
    }

    @Override // defpackage.mnb
    public final mnb minusKey(mna mnaVar) {
        return mjo.z(this, mnaVar);
    }

    @Override // defpackage.mnb
    public final mnb plus(mnb mnbVar) {
        return mjo.A(this, mnbVar);
    }

    public aaz(mnw mnwVar) {
        this.f = mnwVar;
        this.a = new Object();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ala();
    }
}
