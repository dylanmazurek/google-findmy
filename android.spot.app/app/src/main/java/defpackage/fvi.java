package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.account.categories.ClassifyAccountTypeResult;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import com.google.android.gms.people.cpg.CpgDocument;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fvi extends dug implements IInterface {
    public fvi() {
        super("com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks");
    }

    @Override // defpackage.dug
    protected final boolean y(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                duh.b(parcel);
                return true;
            case 2:
                duh.b(parcel);
                return true;
            case 3:
                duh.b(parcel);
                return true;
            case 4:
                duh.b(parcel);
                return true;
            case 5:
                duh.b(parcel);
                return true;
            case 6:
                duh.b(parcel);
                return true;
            case 7:
                Status status = (Status) duh.a(parcel, Status.CREATOR);
                BackupAndSyncOptInState backupAndSyncOptInState = (BackupAndSyncOptInState) duh.a(parcel, BackupAndSyncOptInState.CREATOR);
                duh.b(parcel);
                c(status, backupAndSyncOptInState);
                return true;
            case 8:
                duh.b(parcel);
                return true;
            case 9:
                duh.b(parcel);
                return true;
            case 10:
                parcel.createTypedArrayList(ClassifyAccountTypeResult.CREATOR);
                duh.b(parcel);
                return true;
            case 11:
                duh.b(parcel);
                return true;
            case 12:
                duh.b(parcel);
                return true;
            case 13:
                duh.f(parcel);
                duh.b(parcel);
                return true;
            case 14:
                duh.b(parcel);
                return true;
            case 15:
                duh.b(parcel);
                return true;
            case 16:
                parcel.readInt();
                duh.b(parcel);
                return true;
            case 17:
                duh.f(parcel);
                duh.b(parcel);
                return true;
            case 18:
                b();
                return true;
            case 19:
                Status status2 = (Status) duh.a(parcel, Status.CREATOR);
                duh.b(parcel);
                e(status2);
                return true;
            case 20:
                duh.b(parcel);
                return true;
            case 21:
                Status status3 = (Status) duh.a(parcel, Status.CREATOR);
                String readString = parcel.readString();
                duh.b(parcel);
                d(status3, readString);
                return true;
            case 22:
                duh.b(parcel);
                return true;
            case 23:
                parcel.createTypedArrayList(CpgDocument.CREATOR);
                duh.b(parcel);
                return true;
            default:
                return false;
        }
    }

    public void b() {
    }

    public void e(Status status) {
    }

    public void c(Status status, BackupAndSyncOptInState backupAndSyncOptInState) {
    }

    public void d(Status status, String str) {
    }
}
