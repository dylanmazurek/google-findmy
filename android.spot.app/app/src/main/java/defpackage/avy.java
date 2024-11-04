package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class avy implements axc {
    public bln a = bln.Rtl;
    public float b;
    public float c;
    final /* synthetic */ awd d;

    public avy(awd awdVar) {
        this.d = awdVar;
    }

    @Override // defpackage.ble
    public final float a() {
        return this.b;
    }

    @Override // defpackage.blj
    public final float b() {
        return this.c;
    }

    @Override // defpackage.blj
    public final /* synthetic */ float cc(long j) {
        return bbp.e(this, j);
    }

    @Override // defpackage.awj
    public final /* synthetic */ awi cd(int i, int i2, Map map, moh mohVar) {
        return nq.h(this, i, i2, map, mohVar);
    }

    @Override // defpackage.ble
    public final /* synthetic */ float cf(float f) {
        return bbc.b(this, f);
    }

    @Override // defpackage.ble
    public final /* synthetic */ float cg(int i) {
        return bbc.c(this, i);
    }

    @Override // defpackage.ble
    public final /* synthetic */ float ch(long j) {
        return bbc.d(this, j);
    }

    @Override // defpackage.ble
    public final /* synthetic */ float ci(float f) {
        return bbc.e(this, f);
    }

    @Override // defpackage.ble
    public final /* synthetic */ int cj(float f) {
        return bbc.f(this, f);
    }

    @Override // defpackage.ble
    public final /* synthetic */ long ck(long j) {
        return bbc.g(this, j);
    }

    @Override // defpackage.blj
    public final /* synthetic */ long cl(float f) {
        return bbp.f(this, f);
    }

    @Override // defpackage.ble
    public final /* synthetic */ long cm(float f) {
        return bbc.h(this, f);
    }

    @Override // defpackage.avr
    public final bln m() {
        return this.a;
    }

    @Override // defpackage.avr
    public final boolean n() {
        if (this.d.a.ah() != 4 && this.d.a.ah() != 2) {
            return false;
        }
        return true;
    }

    @Override // defpackage.awj
    public final awi o(int i, int i2, Map map, moh mohVar) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            ll.g(a.aj(i2, i, "Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new avx(i, i2, map, this, this.d, mohVar);
    }

    @Override // defpackage.axc
    public final List p(Object obj, mol molVar) {
        awd awdVar = this.d;
        awdVar.h();
        int ah = awdVar.a.ah();
        if (ah != 1 && ah != 3 && ah != 2 && ah != 4) {
            ll.g("subcompose can only be used inside the measure or layout blocks");
        }
        HashMap hashMap = awdVar.f;
        Object obj2 = hashMap.get(obj);
        if (obj2 == null) {
            obj2 = (ayr) awdVar.i.remove(obj);
            if (obj2 != null) {
                if (awdVar.m <= 0) {
                    ll.g("Check failed.");
                }
                awdVar.m--;
            } else {
                obj2 = awdVar.e(obj);
                if (obj2 == null) {
                    obj2 = awdVar.d(awdVar.c);
                }
            }
            hashMap.put(obj, obj2);
        }
        ayr ayrVar = (ayr) obj2;
        if (mkm.Y(awdVar.a.A(), awdVar.c) != ayrVar) {
            int indexOf = awdVar.a.A().indexOf(ayrVar);
            int i = awdVar.c;
            if (indexOf >= i) {
                if (i != indexOf) {
                    awdVar.k(indexOf, i);
                }
            } else {
                throw new IllegalArgumentException(a.af(obj, "Key \"", "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item."));
            }
        }
        awdVar.c++;
        awdVar.j(ayrVar, obj, molVar);
        if (ah != 1 && ah != 3) {
            return ayrVar.w();
        }
        return ayrVar.x();
    }
}
