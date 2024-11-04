package defpackage;

import android.accounts.Account;
import android.os.AsyncTask;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class duv extends AsyncTask {
    final /* synthetic */ Account a;
    final /* synthetic */ String b;
    final /* synthetic */ dhx c;
    final /* synthetic */ njz d;

    public duv(dhx dhxVar, Account account, String str, njz njzVar) {
        this.a = account;
        this.b = str;
        this.d = njzVar;
        this.c = dhxVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01d3, code lost:            if (r11.equals("PIN_NOTSET") != false) goto L55;     */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.util.Map, java.lang.Object] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r19) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.duv.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [lqz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10, types: [lqz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v19, types: [lqz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [evy, java.lang.Object] */
    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        int i;
        nbw nbwVar = (nbw) obj;
        if (nbwVar == null) {
            i = 900;
        } else {
            i = nbwVar.a;
        }
        njz njzVar = this.d;
        Account account = this.a;
        if (i == 0) {
            kqp kqpVar = (kqp) njzVar.a;
            Object obj2 = kqpVar.a;
            Account b = kqpVar.e.b();
            if (((dyh) obj2).g != null && (b == null || !b.equals(account))) {
                ((dyh) ((kqp) njzVar.a).a).g.aH();
                return;
            }
            ((bym) ((kqp) njzVar.a).b.a()).l(dxq.AUTH_SIGN_IN_SUCCESS);
            kqp kqpVar2 = (kqp) njzVar.a;
            if (((dyh) kqpVar2.a).f) {
                ((bym) kqpVar2.c.a()).i(account.name, true);
            }
            ((dyh) ((kqp) njzVar.a).a).i(account);
            return;
        }
        ((bym) ((kqp) njzVar.a).b.a()).l(dxq.AUTH_SIGN_IN_FAILURE);
        ((dyh) ((kqp) njzVar.a).a).h(account, i);
    }
}
