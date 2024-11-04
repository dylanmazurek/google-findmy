package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.DogfoodsToken;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.FlagOverrides;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwo extends dug implements IInterface {
    private final /* synthetic */ int a;
    private final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fwo(eur eurVar, int i) {
        super("com.google.android.gms.maps.internal.ICancelableCallback");
        this.a = i;
        this.b = eurVar;
    }

    @Override // defpackage.dug
    protected final boolean y(int i, Parcel parcel, Parcel parcel2) {
        int i2 = this.a;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i != 2) {
                    return false;
                }
                ((fjo) this.b).b(new fvt(2));
                return true;
            }
            if (i != 1 && i != 2) {
                return false;
            }
            ((eur) this.b).ak = false;
            parcel2.writeNoException();
            return true;
        }
        switch (i) {
            case 1:
                Status status = (Status) duh.a(parcel, Status.CREATOR);
                duh.b(parcel);
                fma.aZ(status, (bym) this.b);
                return true;
            case 2:
                Status status2 = (Status) duh.a(parcel, Status.CREATOR);
                duh.b(parcel);
                fma.aZ(status2, (bym) this.b);
                return true;
            case 3:
                Status status3 = (Status) duh.a(parcel, Status.CREATOR);
                duh.b(parcel);
                fma.aZ(status3, (bym) this.b);
                return true;
            case 4:
                Status status4 = (Status) duh.a(parcel, Status.CREATOR);
                Configurations configurations = (Configurations) duh.a(parcel, Configurations.CREATOR);
                duh.b(parcel);
                fma.ba(status4, configurations, (bym) this.b);
                return true;
            case 5:
                Status status5 = (Status) duh.a(parcel, Status.CREATOR);
                duh.b(parcel);
                fma.aZ(status5, (bym) this.b);
                return true;
            case 6:
                Status status6 = (Status) duh.a(parcel, Status.CREATOR);
                ExperimentTokens experimentTokens = (ExperimentTokens) duh.a(parcel, ExperimentTokens.CREATOR);
                duh.b(parcel);
                fma.ba(status6, experimentTokens, (bym) this.b);
                return true;
            case 7:
                Status status7 = (Status) duh.a(parcel, Status.CREATOR);
                DogfoodsToken dogfoodsToken = (DogfoodsToken) duh.a(parcel, DogfoodsToken.CREATOR);
                duh.b(parcel);
                fma.ba(status7, dogfoodsToken, (bym) this.b);
                return true;
            case 8:
                Status status8 = (Status) duh.a(parcel, Status.CREATOR);
                duh.b(parcel);
                fma.aZ(status8, (bym) this.b);
                return true;
            case 9:
                Status status9 = (Status) duh.a(parcel, Status.CREATOR);
                Flag flag = (Flag) duh.a(parcel, Flag.CREATOR);
                duh.b(parcel);
                fma.ba(status9, flag, (bym) this.b);
                return true;
            case 10:
                Status status10 = (Status) duh.a(parcel, Status.CREATOR);
                Configurations configurations2 = (Configurations) duh.a(parcel, Configurations.CREATOR);
                duh.b(parcel);
                fma.ba(status10, configurations2, (bym) this.b);
                return true;
            case 11:
                Status status11 = (Status) duh.a(parcel, Status.CREATOR);
                parcel.readLong();
                duh.b(parcel);
                fma.ba(status11, null, (bym) this.b);
                return true;
            case 12:
                Status status12 = (Status) duh.a(parcel, Status.CREATOR);
                duh.b(parcel);
                fma.aZ(status12, (bym) this.b);
                return true;
            case 13:
                Status status13 = (Status) duh.a(parcel, Status.CREATOR);
                FlagOverrides flagOverrides = (FlagOverrides) duh.a(parcel, FlagOverrides.CREATOR);
                duh.b(parcel);
                fma.ba(status13, flagOverrides, (bym) this.b);
                return true;
            case 14:
                Status status14 = (Status) duh.a(parcel, Status.CREATOR);
                duh.b(parcel);
                fma.aZ(status14, (bym) this.b);
                return true;
            case 15:
                Status status15 = (Status) duh.a(parcel, Status.CREATOR);
                duh.b(parcel);
                fma.aZ(status15, (bym) this.b);
                return true;
            case 16:
                Status status16 = (Status) duh.a(parcel, Status.CREATOR);
                long readLong = parcel.readLong();
                duh.b(parcel);
                fma.ba(status16, Long.valueOf(readLong), (bym) this.b);
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fwo(bym bymVar, int i) {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
        this.a = i;
        this.b = bymVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fwo(fjo fjoVar, int i) {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingOptInOptionsChangedListener");
        this.a = i;
        this.b = fjoVar;
    }
}
