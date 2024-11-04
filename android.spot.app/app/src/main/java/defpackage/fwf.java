package defpackage;

import android.os.Parcelable;
import com.google.android.gms.people.protomodel.PhotoEntity;
import com.google.android.gms.people.protomodel.SourceStatsEntity;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.DogfoodsToken;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.FlagOverride;
import com.google.android.gms.phenotype.FlagOverrides;
import com.google.android.gms.phenotype.GenericDimension;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;
import com.google.android.gms.pseudonymous.SessionZwiebackToken;
import com.google.android.gms.signin.internal.AuthAccountResult;
import com.google.android.gms.signin.internal.RecordConsentByConsentResultResponse;
import com.google.android.gms.signin.internal.SignInRequest;
import com.google.android.gms.signin.internal.SignInResponse;
import com.google.android.gms.usagereporting.ConsentInformation;
import com.google.android.gms.usagereporting.ElCapitanOptions;
import com.google.android.gms.usagereporting.SafetyOptions;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwf implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public fwf(int i) {
        this.a = i;
    }

    public static boolean a(int i) {
        if (i == 0) {
            return true;
        }
        return false;
    }

    public static boolean b(Object obj) {
        if (obj == null) {
            return true;
        }
        return false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 500
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r23) {
        /*
            Method dump skipped, instructions count: 1364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fwf.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new SourceStatsEntity[i];
            case 1:
                return new PhotoEntity[i];
            case 2:
                return new Configuration[i];
            case 3:
                return new Configurations[i];
            case 4:
                return new DogfoodsToken[i];
            case 5:
                return new ExperimentTokens[i];
            case 6:
                return new Flag[i];
            case 7:
                return new FlagOverride[i];
            case 8:
                return new FlagOverrides[i];
            case 9:
                return new GenericDimension[i];
            case 10:
                return new PseudonymousIdToken[i];
            case 11:
                return new SessionZwiebackToken[i];
            case 12:
                return new AuthAccountResult[i];
            case 13:
                return new RecordConsentByConsentResultResponse[i];
            case 14:
                return new SignInRequest[i];
            case 15:
                return new SignInResponse[i];
            case 16:
                return new ConsentInformation.AccountConsentInformation[i];
            case 17:
                return new ConsentInformation[i];
            case 18:
                return new ElCapitanOptions[i];
            case 19:
                return new SafetyOptions[i];
            default:
                return new UsageReportingOptInOptions[i];
        }
    }
}
