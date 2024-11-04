package defpackage;

import android.graphics.Typeface;
import android.text.Spannable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkl extends mpe implements mom {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkl(Spannable spannable, mon monVar, int i) {
        super(3);
        this.c = i;
        this.a = spannable;
        this.b = monVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, mon] */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.text.Spannable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [moh, java.lang.Object] */
    @Override // defpackage.mom
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        long m;
        awi cd;
        if (this.c != 0) {
            awj awjVar = (awj) obj;
            awr l = ((awg) obj2).l(((bld) obj3).a);
            if (awjVar.n() && !((Boolean) this.b.a(((wi) this.a).e())).booleanValue()) {
                m = 0;
            } else {
                m = bef.m(l.a, l.b);
            }
            cd = awjVar.cd(blm.b(m), blm.a(m), mly.a, new oq(l, 7));
            return cd;
        }
        bgh bghVar = (bgh) obj;
        int intValue = ((Number) obj2).intValue();
        int intValue2 = ((Number) obj3).intValue();
        bip bipVar = bghVar.f;
        biz bizVar = bghVar.c;
        if (bizVar == null) {
            bizVar = biz.d;
        }
        ?? r3 = this.b;
        ?? r4 = this.a;
        biv bivVar = bghVar.d;
        biv bivVar2 = new biv();
        biw biwVar = bghVar.e;
        r4.setSpan(new bhz((Typeface) r3.e(bipVar, bizVar, bivVar2, new biw())), intValue, intValue2, 33);
        return mlh.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkl(moh mohVar, wi wiVar, int i) {
        super(3);
        this.c = i;
        this.b = mohVar;
        this.a = wiVar;
    }
}
