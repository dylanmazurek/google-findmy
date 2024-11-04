package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fpc extends fio {
    final /* synthetic */ Intent a;
    final /* synthetic */ WeakReference h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fpc(fht fhtVar, Intent intent, WeakReference weakReference) {
        super(fhtVar);
        this.a = intent;
        this.h = weakReference;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ fhz a(Status status) {
        if (status == null) {
            return Status.d;
        }
        return status;
    }

    @Override // defpackage.fio
    protected final /* bridge */ /* synthetic */ void c(fhh fhhVar) {
        ArrayList arrayList;
        fpf fpfVar = (fpf) fhhVar;
        Context context = fpfVar.b;
        fph fphVar = (fph) fpfVar.v();
        GoogleHelp googleHelp = (GoogleHelp) this.a.getParcelableExtra("EXTRA_GOOGLE_HELP");
        int i = googleHelp.M;
        if (i == 0 || i == 1) {
            synchronized (fpi.a) {
                arrayList = new ArrayList(fpi.a);
            }
            if (!arrayList.isEmpty()) {
                googleHelp.N = arrayList;
            }
        }
        try {
            fpb fpbVar = new fpb(this.a, this.h, this);
            Parcel a = fphVar.a();
            duh.c(a, googleHelp);
            duh.c(a, null);
            duh.d(a, fpbVar);
            fphVar.c(2, a);
        } catch (RemoteException e) {
            Log.e("gH_GoogleHelpApiImpl", "Starting help failed!", e);
            l(fpd.a);
        }
    }
}
