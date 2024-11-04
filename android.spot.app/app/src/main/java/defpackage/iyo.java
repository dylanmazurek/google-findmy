package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public class iyo extends dug implements IInterface {
    final /* synthetic */ iym b;
    public final bym c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iyo(iym iymVar, bym bymVar) {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        this.b = iymVar;
        this.c = bymVar;
    }

    public void b(Bundle bundle) {
        this.b.a.e(this.c);
    }

    @Override // defpackage.dug
    protected final boolean y(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            if (i != 3) {
                return false;
            }
            duh.b(parcel);
            iym iymVar = this.b;
            iymVar.a.e(this.c);
            return true;
        }
        Bundle bundle = (Bundle) duh.a(parcel, Bundle.CREATOR);
        duh.b(parcel);
        b(bundle);
        return true;
    }
}
