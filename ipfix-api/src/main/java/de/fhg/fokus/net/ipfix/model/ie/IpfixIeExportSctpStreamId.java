package de.fhg.fokus.net.ipfix.model.ie;

import de.fhg.fokus.net.ipfix.api.IpfixFieldSpecifier;
import de.fhg.fokus.net.ipfix.api.IpfixIe;
import de.fhg.fokus.net.ipfix.api.IpfixIeSemantics;
import de.fhg.fokus.net.ipfix.api.IpfixIeStatus;
import de.fhg.fokus.net.ipfix.api.IpfixIeUnits;
import de.fhg.fokus.net.ipfix.api.codec.IpfixIeCodecUnsigned16;



/**
 * <pre>
exportSctpStreamId:{ 
  elementId:259, 
  dataType:unsigned16, 
  dataTypeSemantis:identifier, 
  units:null 
  status:current 
  en: 0 
}
</pre> 
 * 
 */
public final class IpfixIeExportSctpStreamId extends IpfixIeCodecUnsigned16 implements IpfixIe {
	// -- model --
	private final IpfixFieldSpecifier fieldSpecifier;

	@Override
	public IpfixFieldSpecifier getFieldSpecifier() {
		return fieldSpecifier;
	}

	public IpfixIeExportSctpStreamId() {
		this.fieldSpecifier = new IpfixFieldSpecifier(0).setId(259)
				.setFieldLength(this.fieldLength);
	}
	public IpfixIeExportSctpStreamId( int length ) {
		this.fieldLength = length;
		this.fieldSpecifier = new IpfixFieldSpecifier(0).setId(259)
				.setFieldLength(this.fieldLength);
	}
	public IpfixIeExportSctpStreamId( int length, long enterpriseNumber, boolean isScope ) {
		this.fieldLength = length;
		this.fieldSpecifier = new IpfixFieldSpecifier(enterpriseNumber).setId(259)
				.setFieldLength(this.fieldLength).setScope(isScope);
	}


	@Override
	public IpfixIeSemantics getSemantics() {
		return IpfixIeSemantics.IDENTIFIER;
	}

	@Override
	public IpfixIeStatus getStatus() {
		return IpfixIeStatus.CURRENT;
	}

	@Override
	public String getName() {
		return "exportSctpStreamId";
	}

	@Override
	public int getLength() {
		return fieldSpecifier.getIeLength();
	}

	@Override
	public IpfixIeUnits getUnits() {
		return IpfixIeUnits.NONE;
	}
}
