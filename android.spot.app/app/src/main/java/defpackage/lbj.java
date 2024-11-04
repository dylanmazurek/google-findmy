package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.MarkerOptions;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lbj {
    public final Set a = new LinkedHashSet();
    final /* synthetic */ lbk b;
    public frh c;
    public fri d;
    public frj e;
    final /* synthetic */ lbk f;

    public lbj(lbk lbkVar) {
        this.f = lbkVar;
        this.b = lbkVar;
    }

    public final void a() {
        for (Object obj : this.a) {
            lbk.e(obj);
            this.b.b.remove(obj);
        }
        this.a.clear();
    }

    public final fsa b(MarkerOptions markerOptions) {
        fsf fsfVar;
        try {
            Object obj = this.f.a.a;
            Parcel a = ((duf) obj).a();
            duh.c(a, markerOptions);
            Parcel b = ((duf) obj).b(11, a);
            IBinder readStrongBinder = b.readStrongBinder();
            fsa fsaVar = null;
            if (readStrongBinder == null) {
                fsfVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                if (queryLocalInterface instanceof fsf) {
                    fsfVar = (fsf) queryLocalInterface;
                } else {
                    fsfVar = new fsf(readStrongBinder);
                }
            }
            b.recycle();
            if (fsfVar != null) {
                if (markerOptions.o == 1) {
                    fsaVar = new fsa(fsfVar);
                } else {
                    fsaVar = new fsa(fsfVar);
                }
            }
            this.a.add(fsaVar);
            this.b.b.put(fsaVar, this);
            return fsaVar;
        } catch (RemoteException e) {
            throw new fsc(e);
        }
    }
}
