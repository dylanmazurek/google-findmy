package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avi implements awj, avr {
    public final aym a;
    public avg b;
    public boolean c;

    public avi(aym aymVar, avg avgVar) {
        this.a = aymVar;
        this.b = avgVar;
    }

    @Override // defpackage.ble
    public final float a() {
        return this.a.a();
    }

    @Override // defpackage.blj
    public final float b() {
        return this.a.b();
    }

    @Override // defpackage.blj
    public final float cc(long j) {
        return bbp.e(this.a, j);
    }

    @Override // defpackage.awj
    public final awi cd(int i, int i2, Map map, moh mohVar) {
        return nq.h(this.a, i, i2, map, mohVar);
    }

    @Override // defpackage.ble
    public final float cf(float f) {
        return bbc.b(this.a, f);
    }

    @Override // defpackage.ble
    public final float cg(int i) {
        return bbc.c(this.a, i);
    }

    @Override // defpackage.ble
    public final float ch(long j) {
        return bbc.d(this.a, j);
    }

    @Override // defpackage.ble
    public final float ci(float f) {
        return bbc.e(this.a, f);
    }

    @Override // defpackage.ble
    public final int cj(float f) {
        return bbc.f(this.a, f);
    }

    @Override // defpackage.ble
    public final long ck(long j) {
        return bbc.g(this.a, j);
    }

    @Override // defpackage.blj
    public final long cl(float f) {
        return bbp.f(this.a, f);
    }

    @Override // defpackage.ble
    public final long cm(float f) {
        return bbc.h(this.a, f);
    }

    @Override // defpackage.avr
    public final bln m() {
        return this.a.m();
    }

    @Override // defpackage.avr
    public final boolean n() {
        return false;
    }

    @Override // defpackage.awj
    public final awi o(int i, int i2, Map map, moh mohVar) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            ll.g(a.aj(i2, i, "Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new avh(i, i2, map, mohVar, this);
    }
}
