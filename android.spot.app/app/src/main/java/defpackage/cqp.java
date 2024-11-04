package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class cqp implements bmh {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ cqp(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [mnb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, mol] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.bmh
    public final Object a(bmf bmfVar) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    Object obj = this.a;
                    Object obj2 = this.b;
                    synchronized (((idt) obj2).j) {
                        ((idt) obj2).k.add(obj);
                        ((idt) obj2).l.add(bmfVar);
                    }
                    return null;
                }
                Object obj3 = this.a;
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                ?? r5 = this.b;
                gac gacVar = new gac(atomicBoolean, r5, bmfVar);
                Context context = (Context) obj3;
                context.registerReceiver(gacVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                if (gad.d(context) && atomicBoolean.compareAndSet(false, true)) {
                    context.unregisterReceiver(gacVar);
                    r5.run();
                    bmfVar.c(null);
                    return "DirectBootUtils.runWhenUnlocked";
                }
                bmfVar.a(new ci(atomicBoolean, obj3, gacVar, 14), jxv.a);
                return "DirectBootUtils.runWhenUnlocked";
            }
            ?? r0 = this.a;
            bmfVar.a(new col((muf) r0.get(muf.c), 3, null), cps.a);
            return mpp.q(msz.m(r0), null, 1, new cja((mol) this.b, bmfVar, (mmx) null, 2), 1);
        }
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        bmfVar.a(new col(atomicBoolean2, 4, null), cps.a);
        this.a.execute(new ci((Object) atomicBoolean2, (Object) bmfVar, this.b, 4, (byte[]) null));
        return mlh.a;
    }

    public /* synthetic */ cqp(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
