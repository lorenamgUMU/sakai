package edu.indiana.lib.osid.base.repository.http;

/**********************************************************************************
 * $URL$
 * $Id$
 **********************************************************************************
 *
 * Copyright (c) 2003, 2004, 2005, 2007, 2008 The Sakai Foundation
 *
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.opensource.org/licenses/ECL-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 **********************************************************************************/
/**
 * @author Massachusetts Institute of Techbology, Sakai Software Development Team
 * @version
 */
 


public class ContributorPartStructure extends edu.indiana.lib.osid.base.repository.PartStructure
{

	private static org.apache.commons.logging.Log	_log = edu.indiana.lib.twinpeaks.util.LogUtils.getLog(ContributorPartStructure.class);

    private org.osid.shared.Id CONTRIBUTOR_PART_STRUCTURE_ID = null;
    private org.osid.shared.Type type = new Type("mit.edu","partStructure","contributor","Contributor");
    private String displayName = "Contributor";
    private String description = "Examples of Contributor include a person, an organization, or a service. Typically, the name of a Contributor should be used to indicate the entity.";
    private boolean mandatory = false;
    private boolean populatedByRepository = false;
    private boolean repeatable = true;
		private static ContributorPartStructure contributorPartStructure = new ContributorPartStructure();

		protected static ContributorPartStructure getInstance()
		{
			return contributorPartStructure;
		}

		/**
		 * Public method to fetch the PartStructure ID
		 */
		public static org.osid.shared.Id getPartStructureId()
		{
			org.osid.shared.Id id = null;

			try
			{
				id = getInstance().getId();
			}
			catch (org.osid.repository.RepositoryException ignore) { }

 			return id;
		}

    public String getDisplayName()
    throws org.osid.repository.RepositoryException
    {
        return this.displayName;
    }

    public String getDescription()
    throws org.osid.repository.RepositoryException
    {
        return this.description;
    }

    public boolean isMandatory()
    throws org.osid.repository.RepositoryException
    {
        return this.mandatory;
    }

    public boolean isPopulatedByRepository()
    throws org.osid.repository.RepositoryException
    {
        return this.populatedByRepository;
    }

    public boolean isRepeatable()
    throws org.osid.repository.RepositoryException
    {
        return this.repeatable;
    }

    protected ContributorPartStructure()
    {
        try
        {
            this.CONTRIBUTOR_PART_STRUCTURE_ID = Managers.getIdManager().getId("18a4541f201080006d751920168000100");
        }
        catch (Throwable t)
        {
        }
    }

    public org.osid.shared.Id getId()
    throws org.osid.repository.RepositoryException
    {
        return this.CONTRIBUTOR_PART_STRUCTURE_ID;
    }

    public org.osid.shared.Type getType()
    throws org.osid.repository.RepositoryException
    {
        return this.type;
    }

    public org.osid.repository.RecordStructure getRecordStructure()
    throws org.osid.repository.RepositoryException
    {
        return RecordStructure.getInstance();
    }

    public boolean validatePart(org.osid.repository.Part part)
    throws org.osid.repository.RepositoryException
    {
        return true;
    }

    public org.osid.repository.PartStructureIterator getPartStructures()
    throws org.osid.repository.RepositoryException
    {
        return new PartStructureIterator(new java.util.Vector());
    }
}
